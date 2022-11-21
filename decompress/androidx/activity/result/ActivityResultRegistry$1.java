// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.result;

public class ActivityResultRegistry$1 implements aun
{
    final String a;
    final re b;
    final rm c;
    final rj d;
    
    public ActivityResultRegistry$1(final rj d, final String a, final re b, final rm c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final aup aup, final aui aui) {
        if (aui.ON_START.equals(aui)) {
            this.d.e.put(this.a, new bac(this.b, this.c));
            if (this.d.f.containsKey(this.a)) {
                final Object value = this.d.f.get(this.a);
                this.d.f.remove(this.a);
                this.b.a(value);
            }
            final ActivityResult activityResult = (ActivityResult)this.d.g.getParcelable(this.a);
            if (activityResult != null) {
                this.d.g.remove(this.a);
                this.b.a(this.c.b(activityResult.a, activityResult.b));
            }
        }
        else {
            if (aui.ON_STOP.equals(aui)) {
                this.d.e.remove(this.a);
                return;
            }
            if (aui.ON_DESTROY.equals(aui)) {
                this.d.d(this.a);
            }
        }
    }
}
