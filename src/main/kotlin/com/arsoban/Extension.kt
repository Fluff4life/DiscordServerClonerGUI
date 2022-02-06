package com.arsoban

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.snapshots.SnapshotStateList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

fun SnapshotStateList<String>.addAndUpdateList(elem: String, state: LazyListState, coroutineScope: CoroutineScope) {

    add(elem)

    coroutineScope.launch {
        state.scrollToItem(size - 1)
    }


}