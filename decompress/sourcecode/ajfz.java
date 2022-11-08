import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfz extends agzi implements ahax
{
    public static final ajfz a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ajfz.class, a = new ajfz());
    }
    
    private ajfz() {
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
                if ((d = ajfz.d) == null) {
                    synchronized (ajfz.class) {
                        if (ajfz.d == null) {
                            ajfz.d = (ahbe)new agzb((agzi)ajfz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajfz.a;
            }
            case 4: {
                return new agza((agzi)ajfz.a);
            }
            case 3: {
                return new ajfz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfz.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0000", new Object[] { "b", "c" });
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
