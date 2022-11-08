import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobu extends agzi implements ahax
{
    public static final aobu a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aobu.class, a = new aobu());
    }
    
    private aobu() {
        this.b = 0;
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
                if ((d = aobu.d) == null) {
                    synchronized (aobu.class) {
                        if (aobu.d == null) {
                            aobu.d = (ahbe)new agzb((agzi)aobu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aobu.a;
            }
            case 4: {
                return new agza((agzi)aobu.a);
            }
            case 3: {
                return new aobu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobu.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1036\u0000\u0002\u103b\u0000", new Object[] { "c", "b" });
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
