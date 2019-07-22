/*
 * Created by <a href="mailto:bytesing.inc@gmail.com">bytesing.inc</a> on 7/23/19 12:19 AM.
 * Copyright (c) 2019 <a href="mailto:bytesing.inc@gmail.com">bytesing.inc.</a> All rights reserved.
 */

package com.bytesing.andx.mvp.iview;

import com.bytesing.andx.mvp.ipresenter.IAxPresenter;

import java.util.List;

public interface IAxListView<K,T extends IAxPresenter> extends IAxContentView<T> {
    void onUpdateView(boolean firstPage, List<K> list);
    void onLoadingView(boolean show);
    void onFailView(boolean isShowErrorView, int errorCode, String errorMessage);
}
