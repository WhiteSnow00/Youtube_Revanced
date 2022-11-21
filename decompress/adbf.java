import android.media.AudioRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbf
{
    private static final int[] a;
    private static final short[] b;
    private static final short[] c;
    private AudioRecord d;
    
    static {
        a = new int[] { 16000, 22050, 24000 };
        b = new short[] { 2 };
        c = new short[] { 16 };
    }
    
    public final AudioRecord a() {
        if (this.d == null) {
            final int[] a = adbf.a;
            int i = 0;
        Label_0124:
            while (true) {
                while (i < 3) {
                    final int n = a[i];
                    final short n2 = adbf.b[0];
                    final short n3 = adbf.c[0];
                    try {
                        final int minBufferSize = AudioRecord.getMinBufferSize(n, (int)n3, (int)n2);
                        if (minBufferSize != -2 && minBufferSize != -1) {
                            final AudioRecord d = new AudioRecord(6, n, (int)n3, (int)n2, Math.max(1280, minBufferSize));
                            if (d.getState() == 1) {
                                break Label_0124;
                            }
                            d.release();
                        }
                    }
                    catch (final Exception ex) {
                        tut.c("Could not initialize AudioRecord: ", ex.getMessage());
                    }
                    ++i;
                    continue;
                    AudioRecord d = null;
                    this.d = d;
                    return this.d;
                }
                final AudioRecord d = null;
                continue Label_0124;
            }
        }
        return this.d;
    }
}
