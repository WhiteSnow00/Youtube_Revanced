import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acim implements zqb
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public acim(final txj c, final int a) {
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = aana.B();
    }
    
    public acim(final zqb b, final afci c, final int a) {
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
    
    public final void c(Object o, final tdg tdg) {
        if (this.a == 0) {
            ((zqb)this.b).c((Object)o, (tdg)new acil(tdg, (afci)this.c));
            return;
        }
        final aefs aefs = (aefs)o;
        tcl.k();
        aefs.getClass();
        final String g = ((SubtitleTrack)aefs.a).g();
        g.getClass();
        final File file = new File(g);
        if (!file.exists()) {
            tdg.c((Object)aefs, (Exception)new IOException());
            return;
        }
        o = null;
        Label_0171: {
            InputStream inputStream;
            try {
                inputStream = (InputStream)(o = new BufferedInputStream(new FileInputStream(file), 4096));
                try {
                    final acim acim = this;
                    final Object o2 = acim.c;
                    o = inputStream;
                    final acim acim2 = this;
                    final Object o3 = acim2.b;
                    final aefs aefs2 = (aefs)o3;
                    o = inputStream;
                    final tdg tdg2 = tdg;
                    final aefs aefs3 = aefs;
                    final txj txj = (txj)o2;
                    final txj txj2 = txj;
                    final InputStream inputStream2 = inputStream;
                    final aefs aefs4 = aefs2;
                    final Object o4 = txj2.b(inputStream2, aefs4);
                    final zos zos = (zos)o4;
                    final Object o5 = zos.a();
                    final abuk abuk = (abuk)o5;
                    tdg2.d((Object)aefs3, (Object)abuk);
                    final InputStream inputStream3 = inputStream;
                    a(inputStream3);
                    return;
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex) {
                inputStream = null;
            }
            finally {
                break Label_0171;
            }
            try {
                final acim acim = this;
                final Object o2 = acim.c;
                o = inputStream;
                final acim acim2 = this;
                final Object o3 = acim2.b;
                final aefs aefs2 = (aefs)o3;
                o = inputStream;
                final tdg tdg2 = tdg;
                final aefs aefs3 = aefs;
                final txj txj = (txj)o2;
                final txj txj2 = txj;
                final InputStream inputStream2 = inputStream;
                final aefs aefs4 = aefs2;
                final Object o4 = txj2.b(inputStream2, aefs4);
                final zos zos = (zos)o4;
                final Object o5 = zos.a();
                final abuk abuk = (abuk)o5;
                tdg2.d((Object)aefs3, (Object)abuk);
                final InputStream inputStream3 = inputStream;
                a(inputStream3);
                return;
                o = inputStream;
                final Exception ex;
                tdg.c((Object)aefs, ex);
                a(inputStream);
                return;
            }
            finally {}
        }
        a((InputStream)o);
    }
}
