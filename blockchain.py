import hashlib
import datetime

class Block:
	def __init__(self, previousBlockHash, data, timestamp):
		self.previousBlockHash = previousBlockHash
		self.data = data
		self.timestamp = timestamp
		self.hash = self.getHash()

	@staticmethod
	def createGenesisBlock():
		return Block("0", "0", datetime.datetime.now())

	def getHash(self):
		headerBin = (str(self.previousBlockHash) + str(self.data) + str(self.timestamp)).encode()
		innerHash = hashlib.sha256(headerBin).hexdigest().encode()
		outerHash = hashlib.sha256(innerHash).hexdigest()
		return outerHash