import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbu extends agzi implements ahax
{
    public static final ajbu a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ajbu.class, a = new ajbu());
    }
    
    private ajbu() {
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
                if ((e = ajbu.e) == null) {
                    synchronized (ajbu.class) {
                        if (ajbu.e == null) {
                            ajbu.e = (ahbe)new agzb((agzi)ajbu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajbu.a;
            }
            case 4: {
                return new agza((agzi)ajbu.a);
            }
            case 3: {
                return new ajbu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ajbv.a(), "d", amoo.a() });
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
