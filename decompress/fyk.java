import android.text.TextUtils;
import java.util.Map;
import java.util.List;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyk implements tqd
{
    private final tpt a;
    private final tqn b;
    private final vcy c;
    
    public fyk(final tpt a, final tqn b, final vcy c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final ttl a(final Throwable t) {
        return this.a.a(t);
    }
    
    public final String b(final Throwable t) {
        return this.a.b(t);
    }
    
    public final void c(final int n) {
        this.a.c(n);
    }
    
    public final void d(final String s) {
        this.a.d(s);
    }
    
    public final void e(final Throwable t) {
        if (t instanceof dba) {
            this.b.b();
            return;
        }
        if (!(t instanceof tva)) {
            this.a.d(this.b(t));
            return;
        }
        final tva tva = (tva)t;
        Object o2 = null;
        Label_0145: {
            Label_0092: {
                try {
                    final List b = tva.b();
                    if (!b.isEmpty()) {
                        final Object o = aezp.k((Object)ahbh.parseFrom((ahbh)agzo.a, b.get(0).c, ExtensionRegistryLite.getGeneratedRegistry()));
                        break Label_0092;
                    }
                }
                catch (final ahca ahca) {
                    ttr.n("Could not parse Any detail from StatusError.", (Throwable)ahca);
                }
                final Object o = aeyo.a;
                try {
                    if (((aezp)o).h()) {
                        o2 = aezp.k((Object)ahbh.parseFrom((ahbh)aiqh.a, ((agzo)((aezp)o).c()).c, ExtensionRegistryLite.getGeneratedRegistry()));
                        break Label_0145;
                    }
                }
                catch (final ahca ahca2) {
                    ttr.n("Could not parse command error details from Any.", (Throwable)ahca2);
                }
            }
            o2 = aeyo.a;
        }
        if (((aezp)o2).h() && (((aiqh)((aezp)o2).c()).b & 0x1) != 0x0) {
            final vcy c = this.c;
            CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand;
            if ((commandExecutorCommandOuterClass$CommandExecutorCommand = ((aiqh)((aezp)o2).c()).c) == null) {
                commandExecutorCommandOuterClass$CommandExecutorCommand = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
            }
            c.d((List)commandExecutorCommandOuterClass$CommandExecutorCommand.b, (Map)null);
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)tva.getMessage())) {
            this.a.d(tva.getMessage());
            return;
        }
        this.a.d(this.b(t));
    }
}
