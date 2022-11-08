import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrm extends agzi implements ahax
{
    public static final alrm a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(alrm.class, a = new alrm());
    }
    
    private alrm() {
        this.b = agzi.emptyProtobufList();
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
                if ((d = alrm.d) == null) {
                    synchronized (alrm.class) {
                        if (alrm.d == null) {
                            alrm.d = (ahbe)new agzb((agzi)alrm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrm.a;
            }
            case 4: {
                return new alrl();
            }
            case 3: {
                return new alrm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrm.a, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0002\u0000\u0005\u001b\u0006\u001b", new Object[] { "b", alqq.class, "c", alrk.class });
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
