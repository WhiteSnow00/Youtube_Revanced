import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

final class lrv extends Thread
{
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ lsb b;
    
    public lrv(final lsb b, final AudioTrack a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.flush();
            this.a.release();
        }
        finally {
            this.b.a.open();
        }
    }
}
