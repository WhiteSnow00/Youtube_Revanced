// 
// Decompiled by Procyon v0.6.0
// 

package android.support.rastermill;

import java.io.InputStream;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;

public class FrameSequence
{
    private final int mDefaultLoopCount;
    private final int mFrameCount;
    private final int mHeight;
    private final long mNativeFrameSequence;
    private final boolean mOpaque;
    private final int mWidth;
    
    static /* bridge */ void -$$Nest$smnativeDestroyState(final long n) {
        nativeDestroyState(n);
    }
    
    static /* bridge */ long -$$Nest$smnativeGetFrame(final long n, final int n2, final Bitmap bitmap, final int n3) {
        return nativeGetFrame(n, n2, bitmap, n3);
    }
    
    static {
        System.loadLibrary("framesequence");
    }
    
    private FrameSequence(final long mNativeFrameSequence, final int mWidth, final int mHeight, final boolean mOpaque, final int mFrameCount, final int mDefaultLoopCount) {
        this.mNativeFrameSequence = mNativeFrameSequence;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.mOpaque = mOpaque;
        this.mFrameCount = mFrameCount;
        this.mDefaultLoopCount = mDefaultLoopCount;
    }
    
    public static FrameSequence decodeByteArray(final byte[] array) {
        return decodeByteArray(array, 0, array.length);
    }
    
    public static FrameSequence decodeByteArray(final byte[] array, final int n, final int n2) {
        if (array == null) {
            throw new IllegalArgumentException();
        }
        if (n >= 0 && n2 >= 0 && n + n2 <= array.length) {
            return nativeDecodeByteArray(array, n, n2);
        }
        throw new IllegalArgumentException("invalid offset/length parameters");
    }
    
    public static FrameSequence decodeByteBuffer(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        if (byteBuffer.isDirect()) {
            return nativeDecodeByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
        }
        if (byteBuffer.hasArray()) {
            return decodeByteArray(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
        throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
    }
    
    public static FrameSequence decodeStream(final InputStream inputStream) {
        if (inputStream != null) {
            return nativeDecodeStream(inputStream, new byte[16384]);
        }
        throw new IllegalArgumentException();
    }
    
    private static native long nativeCreateState(final long p0);
    
    private static native FrameSequence nativeDecodeByteArray(final byte[] p0, final int p1, final int p2);
    
    private static native FrameSequence nativeDecodeByteBuffer(final ByteBuffer p0, final int p1, final int p2);
    
    private static native FrameSequence nativeDecodeStream(final InputStream p0, final byte[] p1);
    
    private static native void nativeDestroyFrameSequence(final long p0);
    
    private static native void nativeDestroyState(final long p0);
    
    private static native long nativeGetFrame(final long p0, final int p1, final Bitmap p2, final int p3);
    
    public FrameSequence$State createState() {
        final long mNativeFrameSequence = this.mNativeFrameSequence;
        if (mNativeFrameSequence == 0L) {
            throw new IllegalStateException("attempted to use incorrectly built FrameSequence");
        }
        final long nativeCreateState = nativeCreateState(mNativeFrameSequence);
        if (nativeCreateState == 0L) {
            return null;
        }
        return new FrameSequence$State(nativeCreateState);
    }
    
    @Override
    protected void finalize() {
        try {
            final long mNativeFrameSequence = this.mNativeFrameSequence;
            if (mNativeFrameSequence != 0L) {
                nativeDestroyFrameSequence(mNativeFrameSequence);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public int getDefaultLoopCount() {
        return this.mDefaultLoopCount;
    }
    
    public int getFrameCount() {
        return this.mFrameCount;
    }
    
    public int getHeight() {
        return this.mHeight;
    }
    
    public int getWidth() {
        return this.mWidth;
    }
    
    public boolean isOpaque() {
        return this.mOpaque;
    }
}
