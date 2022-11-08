import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aped extends agzi implements ahax
{
    public static final aped a;
    public static final agzg b;
    private static volatile ahbe d;
    public aioe c;
    private int e;
    private byte f;
    
    static {
        final aped a2 = new aped();
        agzi.registerDefaultInstance(aped.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 383499401, ahcm.k, aped.class);
    }
    
    private aped() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aped.d) == null) {
                    synchronized (aped.class) {
                        if (aped.d == null) {
                            aped.d = (ahbe)new agzb((agzi)aped.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aped.a;
            }
            case 4: {
                return new agza((agzi)aped.a);
            }
            case 3: {
                return new aped();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aped.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
