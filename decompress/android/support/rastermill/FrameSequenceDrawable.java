// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.os.SystemClock;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Shader$TileMode;
import android.os.Looper;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public class FrameSequenceDrawable extends Drawable implements Animatable, Runnable
{
    private static final long DEFAULT_DELAY_MS = 100L;
    public static final int LOOP_DEFAULT = 3;
    public static final int LOOP_FINITE = 1;
    public static final int LOOP_INF = 2;
    @Deprecated
    public static final int LOOP_ONCE = 1;
    private static final long MIN_DELAY_MS = 20L;
    private static final int STATE_DECODING = 2;
    private static final int STATE_READY_TO_SWAP = 4;
    private static final int STATE_SCHEDULED = 1;
    private static final int STATE_WAITING_TO_SWAP = 3;
    private static final String TAG = "FrameSequence";
    private static FrameSequenceDrawable$BitmapProvider sAllocatingBitmapProvider;
    private static HandlerThread sDecodingThread;
    private static Handler sDecodingThreadHandler;
    private static final Object sLock;
    private static final Handler sMainHandler;
    private Bitmap mBackBitmap;
    private BitmapShader mBackBitmapShader;
    private final FrameSequenceDrawable$BitmapProvider mBitmapProvider;
    private boolean mCircleMaskEnabled;
    private int mCornerRadiusPx;
    private int mCurrentLoop;
    private final Runnable mDecodeRunnable;
    private boolean mDestroyed;
    private final Runnable mFinishedCallbackRunnable;
    private final FrameSequence mFrameSequence;
    private final FrameSequence$State mFrameSequenceState;
    private Bitmap mFrontBitmap;
    private BitmapShader mFrontBitmapShader;
    private long mLastSwap;
    private final Object mLock;
    private int mLoopBehavior;
    private int mLoopCount;
    private int mNextFrameToDecode;
    private long mNextSwap;
    private FrameSequenceDrawable$OnFinishedListener mOnFinishedListener;
    private final Paint mPaint;
    private final Rect mSrcRect;
    private int mState;
    private final RectF mTempRectF;
    private final Runnable mUiScheduleRunnable;
    
    static /* bridge */ Bitmap -$$Nest$fgetmBackBitmap(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mBackBitmap;
    }
    
    static /* bridge */ FrameSequenceDrawable$BitmapProvider -$$Nest$fgetmBitmapProvider(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mBitmapProvider;
    }
    
    static /* bridge */ boolean -$$Nest$fgetmDestroyed(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mDestroyed;
    }
    
    static /* bridge */ FrameSequence$State -$$Nest$fgetmFrameSequenceState(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mFrameSequenceState;
    }
    
    static /* bridge */ long -$$Nest$fgetmLastSwap(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mLastSwap;
    }
    
    static /* bridge */ Object -$$Nest$fgetmLock(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mLock;
    }
    
    static /* bridge */ int -$$Nest$fgetmNextFrameToDecode(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mNextFrameToDecode;
    }
    
    static /* bridge */ long -$$Nest$fgetmNextSwap(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mNextSwap;
    }
    
    static /* bridge */ FrameSequenceDrawable$OnFinishedListener -$$Nest$fgetmOnFinishedListener(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mOnFinishedListener;
    }
    
    static /* bridge */ int -$$Nest$fgetmState(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mState;
    }
    
    static /* bridge */ Runnable -$$Nest$fgetmUiScheduleRunnable(final FrameSequenceDrawable frameSequenceDrawable) {
        return frameSequenceDrawable.mUiScheduleRunnable;
    }
    
    static /* bridge */ void -$$Nest$fputmBackBitmap(final FrameSequenceDrawable frameSequenceDrawable, final Bitmap mBackBitmap) {
        frameSequenceDrawable.mBackBitmap = mBackBitmap;
    }
    
    static /* bridge */ void -$$Nest$fputmNextFrameToDecode(final FrameSequenceDrawable frameSequenceDrawable, final int mNextFrameToDecode) {
        frameSequenceDrawable.mNextFrameToDecode = mNextFrameToDecode;
    }
    
    static /* bridge */ void -$$Nest$fputmNextSwap(final FrameSequenceDrawable frameSequenceDrawable, final long mNextSwap) {
        frameSequenceDrawable.mNextSwap = mNextSwap;
    }
    
    static /* bridge */ void -$$Nest$fputmState(final FrameSequenceDrawable frameSequenceDrawable, final int mState) {
        frameSequenceDrawable.mState = mState;
    }
    
    static /* bridge */ Handler -$$Nest$sfgetsMainHandler() {
        return FrameSequenceDrawable.sMainHandler;
    }
    
    static {
        sLock = new Object();
        FrameSequenceDrawable.sAllocatingBitmapProvider = (FrameSequenceDrawable$BitmapProvider)new FrameSequenceDrawable$1();
        sMainHandler = new Handler(Looper.getMainLooper());
    }
    
    public FrameSequenceDrawable(final FrameSequence frameSequence) {
        this(frameSequence, FrameSequenceDrawable.sAllocatingBitmapProvider);
    }
    
    public FrameSequenceDrawable(final FrameSequence mFrameSequence, final FrameSequenceDrawable$BitmapProvider mBitmapProvider) {
        this.mLock = new Object();
        this.mDestroyed = false;
        this.mLoopBehavior = 3;
        this.mLoopCount = 1;
        this.mTempRectF = new RectF();
        this.mDecodeRunnable = new FrameSequenceDrawable$2(this);
        this.mUiScheduleRunnable = new FrameSequenceDrawable$3(this);
        this.mFinishedCallbackRunnable = new FrameSequenceDrawable$4(this);
        if (mFrameSequence != null && mBitmapProvider != null) {
            this.mFrameSequence = mFrameSequence;
            final FrameSequence$State state = mFrameSequence.createState();
            this.mFrameSequenceState = state;
            final int width = mFrameSequence.getWidth();
            final int height = mFrameSequence.getHeight();
            this.mBitmapProvider = mBitmapProvider;
            this.mFrontBitmap = acquireAndValidateBitmap(mBitmapProvider, width, height);
            this.mBackBitmap = acquireAndValidateBitmap(mBitmapProvider, width, height);
            this.mSrcRect = new Rect(0, 0, width, height);
            (this.mPaint = new Paint()).setFilterBitmap(true);
            this.mFrontBitmapShader = new BitmapShader(this.mFrontBitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
            this.mBackBitmapShader = new BitmapShader(this.mBackBitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
            this.mLastSwap = 0L;
            this.mNextFrameToDecode = -1;
            state.getFrame(0, this.mFrontBitmap, -1);
            initializeDecodingThread();
            return;
        }
        throw new IllegalArgumentException();
    }
    
    static void access$001(final FrameSequenceDrawable frameSequenceDrawable, final Runnable runnable) {
        frameSequenceDrawable.unscheduleSelf(runnable);
    }
    
    private static Bitmap acquireAndValidateBitmap(final FrameSequenceDrawable$BitmapProvider frameSequenceDrawable$BitmapProvider, final int n, final int n2) {
        final Bitmap acquireBitmap = frameSequenceDrawable$BitmapProvider.acquireBitmap(n, n2);
        if (acquireBitmap.getWidth() >= n && acquireBitmap.getHeight() >= n2 && acquireBitmap.getConfig() == Bitmap$Config.ARGB_8888) {
            return acquireBitmap;
        }
        throw new IllegalArgumentException("Invalid bitmap provided");
    }
    
    private void checkDestroyedLocked() {
        if (!this.mDestroyed) {
            return;
        }
        throw new IllegalStateException("Cannot perform operation on recycled drawable");
    }
    
    private static void initializeDecodingThread() {
        synchronized (FrameSequenceDrawable.sLock) {
            if (FrameSequenceDrawable.sDecodingThread != null) {
                return;
            }
            (FrameSequenceDrawable.sDecodingThread = new HandlerThread("FrameSequence decoding thread", 10)).start();
            FrameSequenceDrawable.sDecodingThreadHandler = new Handler(FrameSequenceDrawable.sDecodingThread.getLooper());
        }
    }
    
    private void scheduleDecodeLocked() {
        this.mState = 1;
        this.mNextFrameToDecode = (this.mNextFrameToDecode + 1) % this.mFrameSequence.getFrameCount();
        FrameSequenceDrawable.sDecodingThreadHandler.post(this.mDecodeRunnable);
    }
    
    public void destroy() {
        if (this.mBitmapProvider != null) {
            synchronized (this.mLock) {
                this.checkDestroyedLocked();
                final Bitmap mFrontBitmap = this.mFrontBitmap;
                Bitmap mBackBitmap = null;
                this.mFrontBitmap = null;
                if (this.mState != 2) {
                    mBackBitmap = this.mBackBitmap;
                    this.mBackBitmap = null;
                }
                this.mDestroyed = true;
                monitorexit(this.mLock);
                this.mBitmapProvider.releaseBitmap(mFrontBitmap);
                if (mBackBitmap != null) {
                    this.mBitmapProvider.releaseBitmap(mBackBitmap);
                }
                return;
            }
        }
        throw new IllegalStateException("BitmapProvider must be non-null");
    }
    
    public void draw(final Canvas canvas) {
        Object o = this.mLock;
        synchronized (o) {
            this.checkDestroyedLocked();
            if (this.mState == 3 && this.mNextSwap - SystemClock.uptimeMillis() <= 0L) {
                this.mState = 4;
            }
            Label_0189: {
                if (this.isRunning() && this.mState == 4) {
                    final Bitmap mBackBitmap = this.mBackBitmap;
                    this.mBackBitmap = this.mFrontBitmap;
                    this.mFrontBitmap = mBackBitmap;
                    final BitmapShader mBackBitmapShader = this.mBackBitmapShader;
                    this.mBackBitmapShader = this.mFrontBitmapShader;
                    this.mFrontBitmapShader = mBackBitmapShader;
                    this.mLastSwap = SystemClock.uptimeMillis();
                    Label_0185: {
                        if (this.mNextFrameToDecode == this.mFrameSequence.getFrameCount() - 1) {
                            final int mCurrentLoop = this.mCurrentLoop + 1;
                            this.mCurrentLoop = mCurrentLoop;
                            final int mLoopBehavior = this.mLoopBehavior;
                            if (mLoopBehavior == 1) {
                                if (mCurrentLoop != this.mLoopCount) {
                                    break Label_0185;
                                }
                            }
                            else if (mLoopBehavior != 3 || mCurrentLoop != this.mFrameSequence.getDefaultLoopCount()) {
                                break Label_0185;
                            }
                            this.scheduleSelf(this.mFinishedCallbackRunnable, 0L);
                            break Label_0189;
                        }
                    }
                    this.scheduleDecodeLocked();
                }
            }
            monitorexit(o);
            if (!this.mCircleMaskEnabled && this.mCornerRadiusPx <= 0) {
                this.mPaint.setShader((Shader)null);
                canvas.drawBitmap(this.mFrontBitmap, this.mSrcRect, this.getBounds(), this.mPaint);
                return;
            }
            o = this.getBounds();
            final int intrinsicWidth = this.getIntrinsicWidth();
            final int intrinsicHeight = this.getIntrinsicHeight();
            final float n = (float)((Rect)o).width();
            final float n2 = (float)intrinsicWidth;
            final float n3 = (float)((Rect)o).height();
            final float n4 = (float)intrinsicHeight;
            canvas.save();
            canvas.translate((float)((Rect)o).left, (float)((Rect)o).top);
            final float n5 = n / n2;
            final float n6 = n3 / n4;
            canvas.scale(n5, n6);
            this.mPaint.setShader((Shader)this.mFrontBitmapShader);
            if (this.mCircleMaskEnabled) {
                final float n7 = (float)Math.min(((Rect)o).width(), ((Rect)o).height());
                final float n8 = n7 / n5;
                final float n9 = n7 / n6;
                this.mTempRectF.set((n2 - n8) / 2.0f, (n4 - n9) / 2.0f, (n2 + n8) / 2.0f, (n4 + n9) / 2.0f);
                canvas.drawOval(this.mTempRectF, this.mPaint);
            }
            else {
                this.mTempRectF.set(0.0f, 0.0f, (float)this.getIntrinsicWidth(), (float)this.getIntrinsicHeight());
                final float n10 = (float)this.mCornerRadiusPx;
                canvas.drawRoundRect(this.mTempRectF, n10 / n5, n10 / n6, this.mPaint);
            }
            canvas.restore();
        }
    }
    
    protected void finalize() {
        try {
            this.mFrameSequenceState.destroy();
        }
        finally {
            super.finalize();
        }
    }
    
    public final boolean getCircleMaskEnabled() {
        return this.mCircleMaskEnabled;
    }
    
    public int getIntrinsicHeight() {
        return this.mFrameSequence.getHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.mFrameSequence.getWidth();
    }
    
    public int getOpacity() {
        if (this.mFrameSequence.isOpaque()) {
            return -1;
        }
        return -2;
    }
    
    public boolean isDestroyed() {
        synchronized (this.mLock) {
            return this.mDestroyed;
        }
    }
    
    public boolean isRunning() {
        synchronized (this.mLock) {
            final int mNextFrameToDecode = this.mNextFrameToDecode;
            boolean b = false;
            if (mNextFrameToDecode >= 0) {
                b = b;
                if (!this.mDestroyed) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    public void run() {
        synchronized (this.mLock) {
            final int mNextFrameToDecode = this.mNextFrameToDecode;
            int n = 0;
            if (mNextFrameToDecode >= 0) {
                n = n;
                if (this.mState == 3) {
                    this.mState = 4;
                    n = 1;
                }
            }
            monitorexit(this.mLock);
            if (n != 0) {
                this.invalidateSelf();
            }
        }
    }
    
    public void setAlpha(final int alpha) {
        this.mPaint.setAlpha(alpha);
    }
    
    public final void setCircleMaskEnabled(final boolean b) {
        if (this.mCircleMaskEnabled != b) {
            this.mCircleMaskEnabled = b;
            this.mPaint.setAntiAlias(b);
            this.invalidateSelf();
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }
    
    public final void setCornerRadius(final int mCornerRadiusPx) {
        if (this.mCornerRadiusPx != mCornerRadiusPx) {
            this.mCornerRadiusPx = mCornerRadiusPx;
            this.invalidateSelf();
        }
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.mPaint.setFilterBitmap(filterBitmap);
    }
    
    public void setLoopBehavior(final int mLoopBehavior) {
        this.mLoopBehavior = mLoopBehavior;
    }
    
    public void setLoopCount(final int mLoopCount) {
        this.mLoopCount = mLoopCount;
    }
    
    public void setOnFinishedListener(final FrameSequenceDrawable$OnFinishedListener mOnFinishedListener) {
        this.mOnFinishedListener = mOnFinishedListener;
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        if (!b) {
            this.stop();
        }
        else if (b2 || setVisible) {
            this.stop();
            this.start();
        }
        return setVisible;
    }
    
    public void start() {
        if (!this.isRunning()) {
            synchronized (this.mLock) {
                this.checkDestroyedLocked();
                if (this.mState == 1) {
                    return;
                }
                this.mCurrentLoop = 0;
                this.scheduleDecodeLocked();
            }
        }
    }
    
    public void stop() {
        if (this.isRunning()) {
            this.unscheduleSelf(this);
        }
    }
    
    public void unscheduleSelf(final Runnable runnable) {
        synchronized (this.mLock) {
            this.mNextFrameToDecode = -1;
            this.mState = 0;
            monitorexit(this.mLock);
            super.unscheduleSelf(runnable);
        }
    }
}
