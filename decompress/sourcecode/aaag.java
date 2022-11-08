import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaag
{
    public final String a;
    public final int b;
    public final amsh c;
    public final long d;
    public final AtomicInteger e;
    public final Set f;
    public final String g;
    public String h;
    public boolean i;
    public boolean j;
    private final String k;
    
    public aaag(final amsk amsk) {
        final String i = vek.i(amsk.e());
        final amsh actionProto = amsk.getActionProto();
        final int a = vek.a(amsk.getActionProto().d);
        final long longValue = amsk.getEnqueueTimeNs();
        final String rootActionId = amsk.getRootActionId();
        final int b = amsk.b.b;
        final String s = null;
        String parentActionId;
        if ((b & 0x20) != 0x0) {
            parentActionId = amsk.getParentActionId();
        }
        else {
            parentActionId = null;
        }
        this(i, actionProto, a, longValue, rootActionId, parentActionId);
        this.e.set(amsk.getRetryScheduleIndex());
        this.f.addAll(amsk.getChildActionIds());
        String prereqActionId = s;
        if ((amsk.b.b & 0x40) != 0x0) {
            prereqActionId = amsk.getPrereqActionId();
        }
        this.h = prereqActionId;
        this.j = amsk.getHasChildActionFailed();
    }
    
    public aaag(final String a, final amsh c, final int b, final long d, final String g, final String k) {
        this.i = false;
        this.j = false;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = new AtomicInteger();
        this.d = d;
        this.f = new HashSet();
        this.g = g;
        this.k = k;
    }
    
    final aexq a() {
        return aexq.j((Object)this.k);
    }
    
    public final aexq b() {
        return aexq.j((Object)this.h);
    }
    
    public final String c() {
        return this.c.d;
    }
    
    final void d() {
        this.i = true;
    }
    
    public final boolean e() {
        return !this.f.isEmpty();
    }
    
    @Override
    public final String toString() {
        final aexp aexp = new aexp("OfflineAction");
        aexp.f("entityType", this.b);
        aexp.b("entityKey", (Object)this.c.d);
        aexp.g("actionEnqueueTimeNs", this.d);
        int ct;
        if ((ct = aqql.cT(this.c.c)) == 0) {
            ct = 1;
        }
        aexp.b("actionType", (Object)aqql.cS(ct));
        amsf amsf;
        if ((amsf = this.c.e) == null) {
            amsf = amsf.b;
        }
        aexp.f("actionPriority", amsf.d);
        return aexp.toString();
    }
}
