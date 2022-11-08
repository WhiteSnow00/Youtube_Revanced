import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obb extends agzi implements ahax
{
    public static final obb a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance((Class)obb.class, (agzi)(a = new obb()));
    }
    
    private obb() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = obb.c) == null) {
                    synchronized (obb.class) {
                        if (obb.c == null) {
                            obb.c = (ahbe)new agzb((agzi)obb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return obb.a;
            }
            case 4: {
                return new agza((agzi)obb.a);
            }
            case 3: {
                return new obb();
            }
            case 2: {
                return newMessageInfo((MessageLite)obb.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[] { "b" });
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
