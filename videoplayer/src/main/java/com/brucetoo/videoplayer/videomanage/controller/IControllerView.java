package com.brucetoo.videoplayer.videomanage.controller;

import android.view.View;

import com.brucetoo.videoplayer.IViewTracker;

/**
 * Created by Bruce Too
 * On 14/04/2017.
 * At 16:55
 */

public interface IControllerView {

    /**
     * Normal video controller view added in {@link com.brucetoo.videoplayer.VideoTracker#mVideoTopView}
     * when attach to portrait(normal) tracker view
     */
    View normalScreenController(IViewTracker tracker);

    /**
     * Detail video controller view added in {@link com.brucetoo.videoplayer.VideoTracker#mVideoTopView}
     * when attach to detail tracker view
     */
    View detailScreenController(IViewTracker tracker);

    /**
     * Full screen video controller view added in {@link com.brucetoo.videoplayer.VideoTracker#mVideoTopView}
     * when attach to landscape screen
     */
    View fullScreenController(IViewTracker tracker);

    /**
     * Loading state controller view added in {@link com.brucetoo.videoplayer.VideoTracker#mVideoTopView}
     * when video is preparing
     */
    View loadingController(IViewTracker tracker);

    boolean muteVideo();

    boolean enableAutoRotation();
}
