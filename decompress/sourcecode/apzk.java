import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzk extends agzi implements ahax
{
    public static final apzk a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apzk.class, a = new apzk());
    }
    
    private apzk() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apzk.c) == null) {
                    synchronized (apzk.class) {
                        if (apzk.c == null) {
                            apzk.c = (ahbe)new agzb((agzi)apzk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apzk.a;
            }
            case 4: {
                return new agza((agzi)apzk.a);
            }
            case 3: {
                return new apzk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzk.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
