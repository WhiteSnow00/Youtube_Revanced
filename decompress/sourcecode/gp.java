import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gp extends gy
{
    final /* synthetic */ gka a;
    
    public gp(final gka a, final byte[] array) {
        this.a = a;
    }
    
    public final int a() {
        return ((List)this.a.c).size();
    }
    
    public final int b() {
        return ((List)this.a.b).size();
    }
    
    public final boolean c(final int n, final int n2) {
        final aorm value = ((List<aorm>)this.a.b).get(n);
        final aorm value2 = ((List<aorm>)this.a.c).get(n2);
        if (value != null && value2 != null) {
            return ((agzi)value).equals((Object)value2);
        }
        if (value == null && value2 == null) {
            return true;
        }
        throw new AssertionError();
    }
    
    public final boolean d(final int n, final int n2) {
        final aorm value = ((List<aorm>)this.a.b).get(n);
        final aorm value2 = ((List<aorm>)this.a.c).get(n2);
        if (value != null && value2 != null) {
            return value.c.get(0).c.equals(((aorl)value2.c.get(0)).c);
        }
        return value == null && value2 == null;
    }
    
    public final void e(final int n, final int n2) {
        final Object value = ((List<Object>)this.a.b).get(n);
        final Object value2 = ((List<Object>)this.a.c).get(n2);
        if (value != null && value2 != null) {
            return;
        }
        throw new AssertionError();
    }
}
