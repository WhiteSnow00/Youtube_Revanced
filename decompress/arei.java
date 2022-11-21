import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arei extends ahcz implements aheo
{
    public static final arei a;
    private static volatile ahev l;
    public int b;
    public String c;
    public aree d;
    public String e;
    public aree f;
    public String g;
    public int h;
    public String i;
    public boolean j;
    public boolean k;
    
    static {
        ahcz.registerDefaultInstance(arei.class, a = new arei());
    }
    
    private arei() {
        this.c = "";
        this.e = "";
        this.g = "";
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = arei.l) == null) {
                    synchronized (arei.class) {
                        if (arei.l == null) {
                            arei.l = (ahev)new ahcs((ahcz)arei.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return arei.a;
            }
            case 4: {
                return new ahcr((ahcz)arei.a);
            }
            case 3: {
                return new arei();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arei.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0004\u0004\u100c\u0005\u0005\u1008\u0006\u0006\u1007\u0007\u0007\u1008\u0002\b\u1009\u0003\t\u1007\b", new Object[] { "b", "c", "d", "g", "h", areh.a(), "i", "j", "e", "f", "k" });
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
