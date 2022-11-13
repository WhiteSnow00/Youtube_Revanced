import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gp extends gy
{
    final gki a;
    
    public gp(final gki a, final byte[] array) {
        this.a = a;
    }
    
    public final int a() {
        return ((List)this.a.c).size();
    }
    
    public final int b() {
        return ((List)this.a.b).size();
    }
    
    public final boolean c(final int n, final int n2) {
        final aotp value = ((List<aotp>)this.a.b).get(n);
        final aotp value2 = ((List<aotp>)this.a.c).get(n2);
        if (value != null && value2 != null) {
            return ((ahbh)value).equals((Object)value2);
        }
        if (value == null && value2 == null) {
            return true;
        }
        throw new AssertionError();
    }
    
    public final boolean d(final int n, final int n2) {
        final aotp value = ((List<aotp>)this.a.b).get(n);
        final aotp value2 = ((List<aotp>)this.a.c).get(n2);
        if (value != null && value2 != null) {
            return ((aoto)value.c.get(0)).c.equals(((aoto)value2.c.get(0)).c);
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
