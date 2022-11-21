// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class TransactionRecord
{
    public abstract Snapshot beginState();
    
    public abstract Snapshot endState();
    
    public abstract HashSet keys();
    
    public abstract ArrayList keysOrdered();
}
