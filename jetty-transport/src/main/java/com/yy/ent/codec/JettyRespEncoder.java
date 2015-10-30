package com.yy.ent.codec;

import com.yy.ent.protocol.JettyResp;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2015/10/26
 * Time: 20:03
 * To change this template use File | Settings | File Templates.
 */
public class JettyRespEncoder extends MessageToByteEncoder<JettyResp> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, JettyResp resp, ByteBuf byteBuf) throws Exception {
        System.out.println("_________________encoder-----------------------");
        byte[] bytes = resp.encoder();
        byteBuf.writeShort(bytes.length);
        byteBuf.writeBytes(bytes);
    }
}
