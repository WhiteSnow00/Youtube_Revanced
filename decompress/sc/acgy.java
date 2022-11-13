import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgy implements zof
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public acgy(final twh c, final int a) {
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = aale.B();
    }
    
    public acgy(final zof b, final afaq c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static void a(final InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        }
        catch (final IOException ex) {}
    }
    
    public final void c(Object g, final tcc tcc) {
        if (this.a == 0) {
            ((zof)this.b).c((Object)g, (tcc)new acgx(tcc, (afaq)this.c));
            return;
        }
        final aeea aeea = (aeea)g;
        tbi.e();
        aeea.getClass();
        g = ((SubtitleTrack)aeea.a).g();
        g.getClass();
        final File file = new File((String)g);
        if (!file.exists()) {
            tcc.sd((Object)aeea, (Exception)new IOException());
            return;
        }
        Object o8 = null;
        Label_0176: {
            Object o;
            try {
                g = new FileInputStream(file);
                o = (g = new BufferedInputStream((InputStream)g, 4096));
                try {
                    final acgy acgy = this;
                    final Object o2 = acgy.c;
                    g = o;
                    final acgy acgy2 = this;
                    final Object o3 = acgy2.b;
                    final aeea aeea2 = (aeea)o3;
                    g = o;
                    final tcc tcc2 = tcc;
                    final aeea aeea3 = aeea;
                    final Object o4 = o2;
                    final twh twh = (twh)o4;
                    final InputStream inputStream = (InputStream)o;
                    final aeea aeea4 = aeea2;
                    final Object o5 = twh.b(inputStream, aeea4);
                    final zmx zmx = (zmx)o5;
                    final Object o6 = zmx.a();
                    final abta abta = (abta)o6;
                    tcc2.b((Object)aeea3, (Object)abta);
                    final InputStream inputStream2 = (InputStream)o;
                    a(inputStream2);
                    return;
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex) {
                o = null;
            }
            finally {
                final Object o7;
                g = o7;
                break Label_0176;
            }
            try {
                final acgy acgy = this;
                final Object o2 = acgy.c;
                g = o;
                final acgy acgy2 = this;
                final Object o3 = acgy2.b;
                final aeea aeea2 = (aeea)o3;
                g = o;
                final tcc tcc2 = tcc;
                final aeea aeea3 = aeea;
                final Object o4 = o2;
                final twh twh = (twh)o4;
                final InputStream inputStream = (InputStream)o;
                final aeea aeea4 = aeea2;
                final Object o5 = twh.b(inputStream, aeea4);
                final zmx zmx = (zmx)o5;
                final Object o6 = zmx.a();
                final abta abta = (abta)o6;
                tcc2.b((Object)aeea3, (Object)abta);
                final InputStream inputStream2 = (InputStream)o;
                a(inputStream2);
                return;
                g = o;
                final Exception ex;
                tcc.sd((Object)aeea, ex);
                a((InputStream)o);
                return;
            }
            finally {
                o8 = g;
            }
        }
        a((InputStream)o8);
    }
}
