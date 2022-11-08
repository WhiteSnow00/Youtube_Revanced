import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjw extends agzi implements ahax
{
    public static final apjw a;
    private static volatile ahbe d;
    public int b;
    public agzy c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(apjw.class, a = new apjw());
    }
    
    private apjw() {
        this.c = agzi.emptyProtobufList();
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
                if ((d = apjw.d) == null) {
                    synchronized (apjw.class) {
                        if (apjw.d == null) {
                            apjw.d = (ahbe)new agzb((agzi)apjw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjw.a;
            }
            case 4: {
                return new agza((agzi)apjw.a);
            }
            case 3: {
                return new apjw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001a", new Object[] { "e", "b", apje.a(), "c" });
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
