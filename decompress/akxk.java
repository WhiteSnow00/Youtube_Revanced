import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxk extends ahcz implements aheo
{
    public static final akxk a;
    private static volatile ahev g;
    public String b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    private int h;
    private ajws i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akxk.class, a = new akxk());
    }
    
    private akxk() {
        this.j = 2;
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akxk.g) == null) {
                    synchronized (akxk.class) {
                        if (akxk.g == null) {
                            akxk.g = (ahev)new ahcs((ahcz)akxk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akxk.a;
            }
            case 4: {
                return new ahcr((ahcz)akxk.a);
            }
            case 3: {
                return new akxk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxk.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u100b\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "h", "b", "c", "i", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
