package com.tencent.liteav.trtcchatsalon.model.impl.base;


import java.util.List;

public interface TXRoomInfoListCallback {
    void onCallback(int code, String msg, List<TXRoomInfo> list);
}
