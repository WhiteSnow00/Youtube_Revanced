import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpd extends agzi implements ahax
{
    public static final lpd a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(lpd.class, a = new lpd());
    }
    
    private lpd() {
        this.b = agzi.emptyProtobufList();
        this.c = agzi.emptyProtobufList();
        emptyIntList();
    }
    
    public final void a() {
        final agzy c = this.c;
        if (!c.c()) {
            this.c = agzi.mutableCopy(c);
        }
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
                if ((d = lpd.d) == null) {
                    synchronized (lpd.class) {
                        if (lpd.d == null) {
                            lpd.d = (ahbe)new agzb((agzi)lpd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return lpd.a;
            }
            case 4: {
                return new agza((agzi)lpd.a);
            }
            case 3: {
                return new lpd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpd.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[] { "b", lpc.class, "c", lpa.class });
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
