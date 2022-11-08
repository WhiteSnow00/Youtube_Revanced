import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrv extends agzi implements ahax
{
    public static final alrv a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(alrv.class, a = new alrv());
    }
    
    private alrv() {
        this.c = 2;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = alrv.b) == null) {
                    synchronized (alrv.class) {
                        if (alrv.b == null) {
                            alrv.b = (ahbe)new agzb((agzi)alrv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alrv.a;
            }
            case 4: {
                return new agza((agzi)alrv.a);
            }
            case 3: {
                return new alrv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrv.a, "\u0001\u0000", null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
