import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrj extends agzi implements ahax
{
    public static final alrj a;
    private static volatile ahbe e;
    public int b;
    public alqy c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(alrj.class, a = new alrj());
    }
    
    private alrj() {
        this.d = agzi.emptyProtobufList();
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
                if ((e = alrj.e) == null) {
                    synchronized (alrj.class) {
                        if (alrj.e == null) {
                            alrj.e = (ahbe)new agzb((agzi)alrj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alrj.a;
            }
            case 4: {
                return new alrh();
            }
            case 3: {
                return new alrj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "b", "c", "d", alri.class });
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
