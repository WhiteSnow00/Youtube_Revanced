import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.AutoValue_EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.AutoValue_ShareButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeaf
{
    public int a;
    public byte b;
    public Object c;
    
    public aeaf() {
    }
    
    public aeaf(final byte[] array) {
        this.c = aewp.a;
    }
    
    public final aeag a() {
        if (this.b == 1) {
            return new aeag(this.a, (String)this.c);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
    
    public final void b(final int a) {
        this.a = a;
        this.b = 1;
    }
    
    public final xmb c() {
        if (this.b == 1) {
            final Object c = this.c;
            if (c != null) {
                return new xmb(this.a, (String)c);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" recoveryState");
        }
        if (this.c == null) {
            sb.append(" screenName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void d(final int a) {
        this.a = a;
        this.b = 1;
    }
    
    public final void e(final String c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null screenName");
    }
    
    public final vej f() {
        if (this.b == 1) {
            final Object c = this.c;
            if (c != null) {
                return new vej((String)c, this.a);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" entityId");
        }
        if (this.b == 0) {
            sb.append(" entityType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void g(final int a) {
        this.a = a;
        this.b = 1;
    }
    
    public final void h(final int a) {
        this.a = a;
        this.b |= 0x2;
    }
    
    public final qek i() {
        if (this.b == 1) {
            final int a = this.a;
            if (a != 0) {
                return new qek(a, (aexq)this.c);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void j(final boolean b) {
        int a;
        if (!b) {
            a = 2;
        }
        else {
            a = 3;
        }
        this.a = a;
    }
    
    public final ShareButtonData k() {
        if (this.b == 1 && this.c != null) {
            return new AutoValue_ShareButtonData(this.a, (agyc)this.c);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" state");
        }
        if (this.c == null) {
            sb.append(" trackingParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void l(final int a) {
        this.a = a;
        this.b = 1;
    }
    
    public final void m(final agyc c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }
    
    public final EmbedsPrewarmData n() {
        if (this.b == 1) {
            final Object c = this.c;
            if (c != null) {
                return (EmbedsPrewarmData)new AutoValue_EmbedsPrewarmData(this.a, (String)c);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" playbackType");
        }
        if (this.c == null) {
            sb.append(" videoId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void o(final int a) {
        this.a = a;
        this.b = 1;
    }
    
    public final void p(final String c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null videoId");
    }
}
