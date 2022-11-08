import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlf extends agzi implements ahax
{
    public static final anlf a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(anlf.class, a = new anlf());
    }
    
    private anlf() {
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
                if ((b = anlf.b) == null) {
                    synchronized (anlf.class) {
                        if (anlf.b == null) {
                            anlf.b = (ahbe)new agzb((agzi)anlf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anlf.a;
            }
            case 4: {
                return new agza((agzi)anlf.a);
            }
            case 3: {
                return new anlf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlf.a, "\u0001\u0000", null);
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
