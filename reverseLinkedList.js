function reverse(head) {
// Step 1
  let previous = null
  let current = head
  let following = head
// Step 2
  while(current !== null) {
    following = following.next
    current.next = previous
    previous = current          
    current = following
  }
// Step 3  
  return previous
}