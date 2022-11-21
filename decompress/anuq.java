import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuq extends ahcz implements aheo
{
    public static final anuq a;
    private static volatile ahev k;
    public int b;
    public boolean c;
    public anvc d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    
    static {
        ahcz.registerDefaultInstance(anuq.class, a = new anuq());
    }
    
    private anuq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = anuq.k) == null) {
                    synchronized (anuq.class) {
                        if (anuq.k == null) {
                            anuq.k = (ahev)new ahcs((ahcz)anuq.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return anuq.a;
            }
            case 4: {
                return new ahcr((ahcz)anuq.a);
            }
            case 3: {
                return new anuq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuq.a, "\u0001\b\u0000\u0001\u0001\u001e\b\u0000\u0000\u0000\u0001\u1007\u0000\f\u1009\t\u000e\u1007\u000b\u0016\u1007\u0010\u0017\u1007\u0012\u001a\u1007\u0015\u001d\u1007\u0018\u001e\u1007\u0011", new Object[] { "b", "c", "d", "e", "f", "h", "i", "j", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
