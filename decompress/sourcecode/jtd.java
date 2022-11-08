import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtd implements acol
{
    public static final String a;
    public final boolean b;
    public acik c;
    public Object d;
    public boolean e;
    private jtb f;
    private final avt g;
    
    static {
        a = String.valueOf(jtd.class.getName()).concat(".PRESENT_CONTEXT_KEY");
    }
    
    public jtd(final avt g, final acpi acpi, final byte[] array) {
        agot.u(acpi instanceof jtc);
        this.g = g;
        final jtc jtc = (jtc)acpi;
        this.d = jtc.a;
        this.b = jtc.b;
    }
    
    public jtd(final avt g, final boolean b, final byte[] array) {
        this.g = g;
        this.b = b;
    }
    
    public static aexq a(final acij acij) {
        acij.getClass();
        final Object c = acij.c(jtd.a);
        aexq aexq;
        if (c instanceof jtd) {
            aexq = aexq.k((Object)c);
        }
        else {
            aexq = aewp.a;
        }
        return aexq;
    }
    
    public final void c(final jtb f, final Object d) {
        f.getClass();
        d.getClass();
        final jtb f2 = this.f;
        if (f2 != null) {
            f2.e(false);
        }
        if (this.e) {
            f.e(true);
        }
        this.f = f;
        this.d = d;
    }
    
    public final void d(final jtb jtb, final Object o) {
        jtb.getClass();
        o.getClass();
        final Object d = this.d;
        if (d != null) {
            if (o.getClass() == ((aisy)d).getClass()) {
                boolean b;
                if (o instanceof aisy) {
                    final avt g = this.g;
                    final aisy aisy = (aisy)o;
                    aioe a;
                    if (aisy.e == 4) {
                        a = (aioe)aisy.f;
                    }
                    else {
                        a = aioe.a;
                    }
                    final aisy aisy2 = (aisy)d;
                    aioe a2;
                    if (aisy2.e == 4) {
                        a2 = (aioe)aisy2.f;
                    }
                    else {
                        a2 = aioe.a;
                    }
                    b = g.s(a, a2);
                }
                else {
                    if (!(o instanceof aitc)) {
                        return;
                    }
                    final avt g2 = this.g;
                    final aitc aitc = (aitc)o;
                    aioe a3;
                    if (aitc.c == 4) {
                        a3 = (aioe)aitc.d;
                    }
                    else {
                        a3 = aioe.a;
                    }
                    final aitc aitc2 = (aitc)d;
                    aioe a4;
                    if (aitc2.c == 4) {
                        a4 = (aioe)aitc2.d;
                    }
                    else {
                        a4 = aioe.a;
                    }
                    b = g2.s(a3, a4);
                }
                if (b) {
                    this.c(jtb, o);
                }
            }
            return;
        }
        final boolean b2 = this.b;
        boolean b3 = true;
        Label_0385: {
            if (b2) {
                if (o instanceof aitc) {
                    final aitc aitc3 = (aitc)o;
                    aioe a5;
                    if (aitc3.c == 4) {
                        a5 = (aioe)aitc3.d;
                    }
                    else {
                        a5 = aioe.a;
                    }
                    if (((agzd)a5).rs((agyr)DownloadsPageEndpointOuterClass.downloadsPageEndpoint)) {
                        break Label_0385;
                    }
                }
            }
            else if (o instanceof aisy) {
                final aisy aisy3 = (aisy)o;
                aioe a6;
                if (aisy3.e == 4) {
                    a6 = (aioe)aisy3.f;
                }
                else {
                    a6 = aioe.a;
                }
                if (((agzd)a6).rs((agyr)BrowseEndpointOuterClass.browseEndpoint)) {
                    aioe a7;
                    if (aisy3.e == 4) {
                        a7 = (aioe)aisy3.f;
                    }
                    else {
                        a7 = aioe.a;
                    }
                    if ("FEhistory".equals(((aial)((agzd)a7).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c)) {
                        break Label_0385;
                    }
                }
            }
            b3 = false;
        }
        if (b3) {
            this.c(jtb, o);
        }
    }
    
    public final void e(final jtb jtb) {
        jtb.getClass();
        if (jtb.equals(this.f)) {
            this.f = null;
        }
    }
    
    @Override
    public final acpi qv() {
        throw null;
    }
}
