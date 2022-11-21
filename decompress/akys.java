import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akys extends ahcz implements aheo
{
    public static final akys a;
    private static volatile ahev k;
    public int b;
    public String c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    public boolean h;
    public ahbt i;
    public akyr j;
    
    static {
        ahcz.registerDefaultInstance(akys.class, a = new akys());
    }
    
    private akys() {
        this.c = "";
        this.f = "";
        this.i = ahbt.b;
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
                if ((k = akys.k) == null) {
                    synchronized (akys.class) {
                        if (akys.k == null) {
                            akys.k = (ahev)new ahcs((ahcz)akys.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akys.a;
            }
            case 4: {
                return new ahcr((ahcz)akys.a);
            }
            case 3: {
                return new akys();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akys.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0005\u1008\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u100a\u0006\t\u1009\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j" });
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
