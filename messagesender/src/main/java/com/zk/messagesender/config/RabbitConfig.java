package com.zk.messagesender.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitConfig {

    private static String EXCHANGE_NAME="testExchange";
    private static String QUEUE_NAME="testQueue";

    //发送消息
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(new Jackson2JsonMessageConverter());
        template.setConfirmCallback(null);
        template.setMandatory(true);
//        template.set
        return template;
    }
    //接收消息
    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(new Jackson2JsonMessageConverter());
//        factory.set
        return factory;
    }

    // 信道配置，此地使用direct模式
    @Bean
    public DirectExchange defaultExchange() {
        return new DirectExchange(EXCHANGE_NAME, true, false);
    }

    // 配置队列规则属性 例如保活时间 持久化 是否自动删除等
    @Bean
    public Queue queue() {
        Queue queue = new Queue(QUEUE_NAME, true, false, true);
        return queue;
    }

    // 绑定队列和exchange
    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(defaultExchange()).with("bonusSendKey");
    }
}
