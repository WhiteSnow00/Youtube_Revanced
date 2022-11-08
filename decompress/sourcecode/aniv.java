import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aniv extends agzi implements ahax
{
    public static final aniv a;
    private static volatile ahbe e;
    public String b;
    public long c;
    public String d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aniv.class, a = new aniv());
    }
    
    private aniv() {
        this.b = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aniv.e) == null) {
                    synchronized (aniv.class) {
                        if (aniv.e == null) {
                            aniv.e = (ahbe)new agzb((agzi)aniv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aniv.a;
            }
            case 4: {
                return new agza((agzi)aniv.a);
            }
            case 3: {
                return new aniv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aniv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1008\u0002", new Object[] { "f", "b", "c", "d" });
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
