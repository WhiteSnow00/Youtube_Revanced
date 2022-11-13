import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwe
{
    public aiqj a;
    private BrowseResponseModel b;
    private boolean c;
    private boolean d;
    private boolean e;
    private byte f;
    
    public final hwf a() {
        if (this.f == 7) {
            final aiqj a = this.a;
            if (a != null) {
                final BrowseResponseModel b = this.b;
                if (b != null) {
                    return new hwf(a, b, this.c, this.d, this.e);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" endpoint");
        }
        if (this.b == null) {
            sb.append(" browseResponseModel");
        }
        if ((this.f & 0x1) == 0x0) {
            sb.append(" isLoggingEnabled");
        }
        if ((this.f & 0x2) == 0x0) {
            sb.append(" isNewResponseNeeded");
        }
        if ((this.f & 0x4) == 0x0) {
            sb.append(" isLoadingResponse");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final BrowseResponseModel b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null browseResponseModel");
    }
    
    public final void c(final aiqj a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null endpoint");
    }
    
    public final void d(final boolean e) {
        this.e = e;
        this.f |= 0x4;
    }
    
    public final void e(final boolean c) {
        this.c = c;
        this.f |= 0x1;
    }
    
    public final void f(final boolean d) {
        this.d = d;
        this.f |= 0x2;
    }
    
    public final hkj g() {
        if (this.f == 7) {
            final aiqj a = this.a;
            if (a != null) {
                final BrowseResponseModel b = this.b;
                if (b != null) {
                    return new hkj(a, b, this.c, this.d, this.e);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" endpoint");
        }
        if (this.b == null) {
            sb.append(" browseResponseModel");
        }
        if ((this.f & 0x1) == 0x0) {
            sb.append(" isLoggingEnabled");
        }
        if ((this.f & 0x2) == 0x0) {
            sb.append(" isNewResponseNeeded");
        }
        if ((this.f & 0x4) == 0x0) {
            sb.append(" isLoadingResponse");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void h(final BrowseResponseModel b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null browseResponseModel");
    }
    
    public final void i(final boolean e) {
        this.e = e;
        this.f |= 0x4;
    }
    
    public final void j(final boolean c) {
        this.c = c;
        this.f |= 0x1;
    }
    
    public final void k(final boolean d) {
        this.d = d;
        this.f |= 0x2;
    }
}
