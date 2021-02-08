package io.netty.example.echo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;


public class EchoServerOutHandler2 extends ChannelOutboundHandlerAdapter {

    // 向client发送消息
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        System.out.println("out2");
        // 通知执行下一个OutboundHandler
        super.write(ctx, msg, promise);
        super.flush(ctx);
    }
}