/*
 * Created by <a href="mailto:bytesing.inc@gmail.com">bytesing.inc</a> on 7/23/19 12:22 AM.
 * Copyright (c) 2019 <a href="mailto:bytesing.inc@gmail.com">bytesing.inc.</a> All rights reserved.
 */

package com.bytesing.andx.mvp.iview;

import com.bytesing.andx.mvp.ipresenter.IAxPresenter;

public interface IAxView<T extends IAxPresenter> {
    void setPresenter(T presenter);
}
