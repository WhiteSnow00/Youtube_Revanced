import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anks extends agzi implements ahax
{
    public static final anks a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(anks.class, a = new anks());
    }
    
    private anks() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = anks.d) == null) {
                    synchronized (anks.class) {
                        if (anks.d == null) {
                            anks.d = (ahbe)new agzb((agzi)anks.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anks.a;
            }
            case 4: {
                return new agza((agzi)anks.a);
            }
            case 3: {
                return new anks();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anks.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0002", new Object[] { "b", "c" });
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
