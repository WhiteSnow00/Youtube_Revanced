import android.text.TextUtils;
import java.util.Map;
import java.util.List;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyc implements tny
{
    private final tnn a;
    private final toi b;
    private final vax c;
    
    public fyc(final tnn a, final toi b, final vax c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final trg a(final Throwable t) {
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
        if (t instanceof daz) {
            this.b.b();
            return;
        }
        if (!(t instanceof tsw)) {
            this.a.d(this.b(t));
            return;
        }
        final tsw tsw = (tsw)t;
        aexq aexq2 = null;
        Label_0145: {
            Label_0092: {
                try {
                    final List b = tsw.b();
                    if (!b.isEmpty()) {
                        final aexq aexq = aexq.k((Object)agzi.parseFrom((agzi)agxp.a, b.get(0).c, ExtensionRegistryLite.getGeneratedRegistry()));
                        break Label_0092;
                    }
                }
                catch (final ahab ahab) {
                    trn.n("Could not parse Any detail from StatusError.", (Throwable)ahab);
                }
                final aexq aexq = aewp.a;
                try {
                    if (aexq.h()) {
                        aexq2 = aexq.k((Object)agzi.parseFrom((agzi)aioc.a, ((agxp)aexq.c()).c, ExtensionRegistryLite.getGeneratedRegistry()));
                        break Label_0145;
                    }
                }
                catch (final ahab ahab2) {
                    trn.n("Could not parse command error details from Any.", (Throwable)ahab2);
                }
            }
            aexq2 = aewp.a;
        }
        if (aexq2.h() && (((aioc)aexq2.c()).b & 0x1) != 0x0) {
            final vax c = this.c;
            CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand;
            if ((commandExecutorCommandOuterClass$CommandExecutorCommand = ((aioc)aexq2.c()).c) == null) {
                commandExecutorCommandOuterClass$CommandExecutorCommand = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
            }
            c.d((List)commandExecutorCommandOuterClass$CommandExecutorCommand.b, (Map)null);
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)tsw.getMessage())) {
            this.a.d(tsw.getMessage());
            return;
        }
        this.a.d(this.b(t));
    }
}
