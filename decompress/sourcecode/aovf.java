import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovf extends agzi implements ahax
{
    public static final aovf a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(aovf.class, a = new aovf());
    }
    
    private aovf() {
        this.c = 2;
        emptyProtobufList();
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
                if ((b = aovf.b) == null) {
                    synchronized (aovf.class) {
                        if (aovf.b == null) {
                            aovf.b = (ahbe)new agzb((agzi)aovf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovf.a;
            }
            case 4: {
                return new agza((agzi)aovf.a);
            }
            case 3: {
                return new aovf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovf.a, "\u0001\u0000", null);
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
