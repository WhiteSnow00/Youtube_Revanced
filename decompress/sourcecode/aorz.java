import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorz extends agzi implements ahax
{
    public static final aorz a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(aorz.class, a = new aorz());
    }
    
    private aorz() {
        this.b = agzi.emptyProtobufList();
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
                if ((c = aorz.c) == null) {
                    synchronized (aorz.class) {
                        if (aorz.c == null) {
                            aorz.c = (ahbe)new agzb((agzi)aorz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aorz.a;
            }
            case 4: {
                return new agza((agzi)aorz.a);
            }
            case 3: {
                return new aorz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aosl.class });
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
