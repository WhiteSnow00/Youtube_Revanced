import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzw extends agzi implements ahax
{
    public static final apzw a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public ahca d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(apzw.class, a = new apzw());
    }
    
    private apzw() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apzw.f) == null) {
                    synchronized (apzw.class) {
                        if (apzw.f == null) {
                            apzw.f = (ahbe)new agzb((agzi)apzw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apzw.a;
            }
            case 4: {
                return new agza((agzi)apzw.a);
            }
            case 3: {
                return new apzw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aorw.a() });
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
