import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apss extends agzi implements ahax
{
    public static final apss a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance((Class)apss.class, (agzi)(a = new apss()));
    }
    
    private apss() {
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apss.d) == null) {
                    synchronized (apss.class) {
                        if (apss.d == null) {
                            apss.d = (ahbe)new agzb((agzi)apss.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apss.a;
            }
            case 4: {
                return new agza((agzi)apss.a);
            }
            case 3: {
                return new apss();
            }
            case 2: {
                return newMessageInfo((MessageLite)apss.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[] { "b", apsl.class, "c", apsv.class });
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
