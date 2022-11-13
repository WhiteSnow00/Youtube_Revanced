import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byx extends bxh
{
    private final bas a;
    
    public byx() {
        super("Mp4WebvttDecoder");
        this.a = new bas();
    }
    
    protected final bxi n(final byte[] array, int i, final boolean b) {
        this.a.E(array, i);
        final ArrayList list = new ArrayList();
        while (this.a.a() > 0) {
            if (this.a.a() < 8) {
                throw new bxk("Incomplete Mp4Webvtt Top Level box header found.");
            }
            i = this.a.d();
            if (this.a.d() == 1987343459) {
                final bas a = this.a;
                i -= 8;
                Object a2 = null;
                azx azx = null;
                while (i > 0) {
                    if (i < 8) {
                        throw new bxk("Incomplete vtt cue box header found.");
                    }
                    int d = a.d();
                    final int d2 = a.d();
                    d -= 8;
                    final String o = bax.O(a.a, a.b, d);
                    a.H(d);
                    azx b2;
                    if (d2 == 1937011815) {
                        b2 = bze.b(o);
                    }
                    else {
                        b2 = azx;
                        if (d2 == 1885436268) {
                            a2 = bze.a((String)null, o.trim(), (List)Collections.emptyList());
                            b2 = azx;
                        }
                    }
                    i = i - 8 - d;
                    azx = b2;
                }
                CharSequence a3;
                if ((a3 = (CharSequence)a2) == null) {
                    a3 = "";
                }
                azy azy;
                if (azx != null) {
                    azx.a = a3;
                    azy = azx.a();
                }
                else {
                    azy = bze.c(a3);
                }
                list.add(azy);
            }
            else {
                this.a.H(i - 8);
            }
        }
        return (bxi)new byc((List)list, 3, (byte[])null);
    }
}
