import android.media.MediaCodec$CryptoInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bda
{
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec$CryptoInfo i;
    public final eae j;
    
    public bda() {
        final MediaCodec$CryptoInfo i = new MediaCodec$CryptoInfo();
        this.i = i;
        final int a = baz.a;
        this.j = new eae(i);
    }
}
