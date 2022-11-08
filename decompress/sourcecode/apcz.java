import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcz extends agzi implements ahax
{
    public static final apcz a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(apcz.class, a = new apcz());
    }
    
    private apcz() {
        this.c = 2;
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
                if ((b = apcz.b) == null) {
                    synchronized (apcz.class) {
                        if (apcz.b == null) {
                            apcz.b = (ahbe)new agzb((agzi)apcz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apcz.a;
            }
            case 4: {
                return new agza((agzi)apcz.a);
            }
            case 3: {
                return new apcz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcz.a, "\u0001\u0000", null);
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
