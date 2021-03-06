package net.kingsilk.qh.agency.msg.api.search.esItem.sync;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

/**
 * 定时从微信批量获取关注用户信息。
 */
public interface SyncApi {

    /**
     * 更新指定的微信 APP 的 jsApi Ticket。
     * 检查是否过期仅仅依赖于本地存储的过期时间。
     *
     * - 加分布式锁。
     * - 检查 WxMpJsAt 是否需要更新。
     *     - 如果需要更新，则更新
     *     - 如果不需要更新，则结束。
     *
     */
    @SyncListener
    @EventListener
    @Async
    void handle(SyncEvent syncEvent);

}
