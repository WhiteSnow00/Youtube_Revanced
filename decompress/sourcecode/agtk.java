import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtk extends agzi implements ahax
{
    public static final agtk a;
    private static volatile ahbe j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    
    static {
        agzi.registerDefaultInstance(agtk.class, a = new agtk());
    }
    
    private agtk() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = agtk.j) == null) {
                    synchronized (agtk.class) {
                        if (agtk.j == null) {
                            agtk.j = (ahbe)new agzb((agzi)agtk.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agtk.a;
            }
            case 4: {
                return new agza((agzi)agtk.a);
            }
            case 3: {
                return new agtk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtk.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u100c\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", agtj.b() });
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
