import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anky extends agzi implements ahax
{
    public static final anky a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(anky.class, a = new anky());
    }
    
    private anky() {
        this.c = "";
        this.d = agyc.b;
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
                if ((e = anky.e) == null) {
                    synchronized (anky.class) {
                        if (anky.e == null) {
                            anky.e = (ahbe)new agzb((agzi)anky.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anky.a;
            }
            case 4: {
                return new agza((agzi)anky.a);
            }
            case 3: {
                return new anky();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anky.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
