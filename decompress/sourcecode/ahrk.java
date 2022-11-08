import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrk extends agzi implements ahax
{
    public static final ahrk a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahrk.class, a = new ahrk());
    }
    
    private ahrk() {
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
                if ((c = ahrk.c) == null) {
                    synchronized (ahrk.class) {
                        if (ahrk.c == null) {
                            ahrk.c = (ahbe)new agzb((agzi)ahrk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahrk.a;
            }
            case 4: {
                return new agza((agzi)ahrk.a);
            }
            case 3: {
                return new ahrk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrk.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1007\u0002", new Object[] { "d", "b" });
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
